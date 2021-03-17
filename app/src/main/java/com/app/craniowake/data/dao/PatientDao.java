package com.app.craniowake.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.app.craniowake.data.model.Patient;

import java.util.List;

/**
 * data access object which handles all Queries for the Patient model.
 */
@Dao
public abstract class PatientDao {

    /**
     * equivalent to a SQL INSERT INTO statement
     *
     * @param patient object is saved as an insert entry to db
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract void addPatient(Patient patient);

    /**
     * equivalent to a SQL SELECT Query. Returns all Patients by caseNumber in descending order
     */
    @Query("SELECT * FROM patient_table ORDER BY caseNumber DESC")
    public abstract LiveData<List<Patient>> getAllPatients();

    /**
     * equivalent to a SQL SELECT Query. Returns all Patients by id
     *
     * @param id autogenerated id of patient
     */
    @Query("SELECT * FROM patient_table WHERE patientId = :id")
    public abstract LiveData<Patient> getById(int id);

}
