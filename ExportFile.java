//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExportFile {
    public static void main(String[] args) {
        ExportContext ctx = new ExportContext(new ExportJPG());
        ctx.createArchive("UEF");

        ctx.setStrategy(new ExportPNG());
        ctx.createArchive("UEF");

        ctx.setStrategy(new ExportPDF());
        ctx.createArchive("UEF");

    }
}

interface ExportStrategy {
    void ExportFile (String fileName);
}

class ExportJPG implements ExportStrategy {
    public void ExportFile (String fileName) {
        System.out.println("\n| Export file: '" + fileName + "' JPG successfully");
    }
}

class ExportPNG implements ExportStrategy {
    public void ExportFile (String fileName) {
        System.out.println("\n| Export file: '" + fileName + "' PNG successfully");
    }
}

class ExportPDF implements ExportStrategy {
    public void ExportFile (String fileName) {
        System.out.println("\n| Export file: '" + fileName + "' PDF successfully");
    }
}

class ExportContext {
    private ExportStrategy _export;

    public ExportContext (ExportStrategy export) {
        this._export = export;
    }

    public void setStrategy (ExportStrategy export) {
        this._export = export;
    }

    public void createArchive (String fileName) {
        _export.ExportFile(fileName);
    }
}