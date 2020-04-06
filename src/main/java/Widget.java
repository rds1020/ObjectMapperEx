public class Widget {

    private String widgetType;
    private Integer guid;

    public Widget(){

    }

    public Widget(String widgetType, int guid) {
        this.widgetType = widgetType;
        this.guid = guid;
    }

    public String getWidgetType() {
        return widgetType;
    }

    public void setWidgetType(String widgetType) {
        this.widgetType = widgetType;
    }

    public int getGuid() {
        return guid;
    }

    public void setGuid(int guid) {
        this.guid = guid;
    }
}
