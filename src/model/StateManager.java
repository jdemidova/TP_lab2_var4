package model;
import javax.xml.bind.*;
import java.io.File;
public class StateManager {
    public static final String STATE_FILENAME = "state.xml";
    private File file;
    private JAXBContext context;

    public StateManager() throws JAXBException {
        this.file = new File(STATE_FILENAME);
        this.context = JAXBContext.newInstance(PolarPointState.class);
    }

    public int getAngleState() throws JAXBException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return ((PolarPointState)unmarshaller.unmarshal(file)).getAngleState();
    }

    public double getRadiusState() throws JAXBException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return ((PolarPointState)unmarshaller.unmarshal(file)).getRadiusState();
    }

    public void setState(double current_radius, int current_angle) throws JAXBException {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(new PolarPointState(current_radius, current_angle), file);
    }
}
