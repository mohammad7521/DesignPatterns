package structural.decorator;


import structural.decorator.external.Datasource;

public class EncryptionDecorator extends DatasourceDecorator {

    public EncryptionDecorator(Datasource datasource) {
        super(datasource);
    }

    @Override
    public void write(String data) {
        System.out.println("Encrypting Data ....");
        var encryptedData = encrypt(data);
        super.write(encryptedData);
    }

    @Override
    public String read() {
        System.out.println("Decrypting Data ....");
        var encryptedData = super.read();
        var normalData = decrypt(encryptedData);
        return normalData;
    }

    private String encrypt(String data) {
        // Some heavy mysterious encryption.
        return data;
    }

    private String decrypt(String encrypted) {
        // Some Magical decryption
        return encrypted;
    }
}
