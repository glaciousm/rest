package gr.fileMakerService.endpoint;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface FileMakerService {
	
	@WebMethod 
	@WebResult(name = "agent")
	List<String> message(MessageRequest req) throws Exception;

}
