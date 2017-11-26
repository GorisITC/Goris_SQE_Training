import java.util.ArrayList;
import java.util.List;

public class RequestGroup {

    private List<Request> requestList= new ArrayList<>();
    private String name;
    
    public RequestGroup(Request request){
        this.name=request.getName();
    
        add(request);
    }
    public void add(Request request){
        requestList.add(request);
    }
    
    public String getName() {
        return name;
    }
    
    public List<Request> getRequestList() {
    	return requestList;
    }
    	
}
