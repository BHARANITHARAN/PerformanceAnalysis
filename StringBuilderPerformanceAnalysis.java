public class StringBuilderTest {

    private static void stringBuilderPerformanceAnalysis() {
        long startTime = System.nanoTime();
        String tenantId= "ase34t";
        String message = "Cannot create poolable connection factory";
        StringBuilder sb = new StringBuilder();
        sb.append("Cant get Db Connection for Tenant").append(tenantId).append(" : ").append(message);
        String errorMessage = sb.toString();
        long endTime = System.nanoTime();
        System.out.println("Execution Time for String Builder : " + (endTime-startTime) + " In Nanos");
    }

    private static void stringformatterPerformanceAnalysis() {
        long startTime = System.nanoTime();
        String tenantId= "ase34t";
        String message = "Cannot create poolable connection factory";
        String errorMessage = String.format("Cant get Db Connection for Tenant %s : %s", tenantId, message);
        long endTime = System.nanoTime();
        System.out.println("Execution Time for String Formatter : " + (endTime-startTime) + " In Nanos");
    }
    public static void main(String[] args) {
        stringformatterPerformanceAnalysis();
        stringBuilderPerformanceAnalysis();
    }
}
