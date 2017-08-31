package gr.fileMakerService.endpoint;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageRequest", propOrder = { "fileList" })
public class MessageRequest {
	
	@XmlElement(required = true)
	protected List<File> fileList;
	
	public MessageRequest() {
		// TODO Auto-generated constructor stub
	}

	public List<File> getFileList() {
		return fileList;
	}

	public void setFileList(List<File> fileList) {
		this.fileList = fileList;
	}

	@Override
	public String toString() {
		return "MessageRequest [fileList=" + fileList + "]";
	}
	
	
}
