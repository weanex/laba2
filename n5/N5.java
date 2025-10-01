package n5;

public class N5 {
    public static void main(String[] args) {
        Table table = new Table(3,3);

        System.out.println("Table's rows: " + table.rows());
        System.out.println("Table's columns: " + table.cols());

        System.out.println("Table at the beginning: ");
        System.out.print(table.toString());

        table.setValue(0, 0, 14);
        table.setValue(0, 1, 146);
        table.setValue(0, 2, 157);
        table.setValue(1, 0, 1345);
        table.setValue(1, 1, 876);
        table.setValue(1, 2, 44);
        table.setValue(2, 0, 54);
        table.setValue(2, 1, 76);
        table.setValue(2, 2, 78);

        System.out.println("Table after setting values: ");
        System.out.print(table.toString());


        System.out.println("Table's separate values: ");
        System.out.println(table.getValue(0, 0));
        System.out.println(table.getValue(0, 1));
        System.out.println(table.getValue(0, 2));
        System.out.println(table.getValue(1, 0));
        System.out.println(table.getValue(1, 1));
        System.out.println(table.getValue(1, 2));
        System.out.println(table.getValue(2, 0));
        System.out.println(table.getValue(2, 1));
        System.out.println(table.getValue(2, 2));

        System.out.println("Table's average value: " + table.average());
    }
}