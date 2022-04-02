package structural.decorator;


import structural.decorator.external.Datasource;

// Wrapping Datasource object.
public class DatasourceDecorator extends Datasource {

    private Datasource datasource;

    public DatasourceDecorator(Datasource datasource) {
        super();
        this.datasource = datasource;
    }

    public void write(String data) {
        datasource.write(data);
    }

    public String read() {
        return datasource.read();
    }
}
