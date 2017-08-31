package gr.fileMakerService.endpoint;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageResponse", propOrder = { "result" })
public class MessageResponse {
	
	protected List<String> result;
	
	public MessageResponse() {
		// TODO Auto-generated constructor stub
	}

	public List<String> getResult() {
		return result;
	}

	public void setResult(List<String> result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "MessageResponse [result=" + result + "]";
	}

}
