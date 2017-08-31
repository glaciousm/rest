package gr.fileMakerService.endpoint;

public class File {
	
	String fileName;
	
	String filePath;
	
	String writeString;
	
	public File() {
		// TODO Auto-generated constructor stub
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getWriteString() {
		return writeString;
	}

	public void setWriteString(String writeString) {
		this.writeString = writeString;
	}

	@Override
	public String toString() {
		return "File [fileName=" + fileName + ", filePath=" + filePath + ", writeString=" + writeString + "]";
	}

}
