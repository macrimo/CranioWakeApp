package com.app.craniowake.data.model.gameModels;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import com.app.craniowake.data.model.Operation;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import lombok.Data;

import static androidx.room.ForeignKey.CASCADE;

/**
 * Model of the Digital Span Memory Test
 */
@Data
@Entity(tableName = "digital_span_test_table")
public class DigitalSpanMemoryGame {

    @PrimaryKey(autoGenerate = true)
    private int digitalSpanMemoryId;
    private boolean answer;
    private String dateTime;
    @ForeignKey
            (entity = Operation.class,
                    parentColumns = "operationId",
                    childColumns = "fkOperationId",
                    onDelete = CASCADE
            )
    private int fkOperationId;


    public DigitalSpanMemoryGame(boolean answer, int fkOperationId) {
        this.answer = answer;
        this.fkOperationId = fkOperationId;
        setCurrentDateTime();
    }

    /**
     * returns current Date and Time when called.
     */
    private void setCurrentDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.systemDefault());
        this.dateTime = formatDateTime(localDateTime);
    }

    /**
     * Entity of the Calculus Test
     *
     * @param localDateTime formats generated datetime to: JJJJ-MM-DDT00:00:00.000
     */
    private String formatDateTime(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        return localDateTime.format(formatter);
    }

}
