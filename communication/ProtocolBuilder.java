import org.json.*;
import util.enums.HelperEnum;

public class ProtocolBuilder {


    public ProtocolBuilder(HelperEnum.ClientServer _type) {
        if (_type == HelperEnum.ClientServer.server) {
            buildHeaderServer();
        } else {
            buildHeaderClient();
        }
    }

    public void buildHeaderServer(){
        //HelperEnu
    }

    public void buildHeaderClient(){

    }

}