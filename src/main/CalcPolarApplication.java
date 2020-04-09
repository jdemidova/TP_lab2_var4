package main;
import model.StateManager;
import view.CalcUI;
import javax.xml.bind.JAXBException;

public class CalcPolarApplication {
    private StateManager stateManager;
    private CalcUI ui;

    public CalcPolarApplication() {
        try {
            this.stateManager = new StateManager();
        }
        catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        this.ui = new CalcUI(this);
    }

    public StateManager getStateManager() {
        return stateManager;
    }

    public void run() {
        ui.run();
    }
}
