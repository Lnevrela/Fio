import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestComboBox {

    public static Map<String, Object>[] getDbData() {
        List<Map<String, Object>> rows = new ArrayList<>();

        Map<String, Object> row = new HashMap<>();
        row.put("ID", 1);
        row.put("ID_GROUP", 10);
        row.put("GROUP", "Jihozapadni cechy");
        row.put("NAME", "Klatovy");
        rows.add(row);

        row = new HashMap<>();
        row.put("ID", 2);
        row.put("ID_GROUP", 10);
        row.put("GROUP", "Jihozapadni cechy");
        row.put("NAME", "Pisek");
        rows.add(row);

        row = new HashMap<>();
        row.put("ID", 3);
        row.put("ID_GROUP", 10);
        row.put("GROUP", "Jihozapadni cechy");
        row.put("NAME", "Tabor");
        rows.add(row);

        row = new HashMap<>();
        row.put("ID", 4);
        row.put("ID_GROUP", 20);
        row.put("GROUP", "Stredne Slovensko");
        row.put("NAME", "Levice");
        rows.add(row);

        row = new HashMap<>();
        row.put("ID", 5);
        row.put("ID_GROUP", 20);
        row.put("GROUP", "Stredne Slovensko");
        row.put("NAME", "Martin");
        rows.add(row);

        row = new HashMap<>();
        row.put("ID", 6);
        row.put("ID_GROUP", 30);
        row.put("GROUP", "Centrum");
        row.put("NAME", "Fio");
        rows.add(row);

        return rows.toArray(new Map[rows.size()]);
    }
}
