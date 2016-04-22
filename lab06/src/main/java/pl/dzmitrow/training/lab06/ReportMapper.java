package pl.dzmitrow.training.lab06;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.batch.item.file.transform.FieldSetFactory;
import org.springframework.validation.BindException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ReportMapper implements FieldSetMapper<Report> {

    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public Report mapFieldSet(FieldSet fieldSet) throws BindException {
        Report r = new Report();
        r.setId(fieldSet.readLong("id"));
        r.setName(fieldSet.readString("name"));
        r.setQty(fieldSet.readInt(2));
        String date = fieldSet.readString(3);
        try {
            r.setDate(formatter.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return r;
    }
}
