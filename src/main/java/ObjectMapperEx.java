import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ObjectMapperEx {
    public static void main(String[] args) {
        ObjectMapperEx c = new ObjectMapperEx();

        SerializeToJson serializeToJson = new SerializeToJson();
        serializeToJson.serialize();

        DeserializeFromJson deserializeFromJson = new DeserializeFromJson();
        deserializeFromJson.deserialize();
    }
}

class DeserializeFromJson{
    void deserialize() {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "{ \"widgetType\" : \"topper\", \"guid\" : \"321\" }";

        try {
            Widget widget = objectMapper.readValue(json, Widget.class);
            System.out.println("Resulting Java Object -> WidgetType: " + widget.getWidgetType() + " Guid: " + widget.getGuid());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SerializeToJson {
    void serialize(){
        ObjectMapper objectMapper = new ObjectMapper();
        Widget widget = new Widget("topper", 123);

        try {
            System.out.println("Resulting JSON Object -> " + objectMapper.writeValueAsString(widget));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}