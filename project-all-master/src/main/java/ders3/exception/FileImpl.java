package ders3.exception;

public class FileImpl implements File {
    @Override
    public void readFile() {
        try {
            throw new Exception("Hata Fırlattım");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally calistiii...");
        }
    }
}
