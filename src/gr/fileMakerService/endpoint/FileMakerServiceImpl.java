package gr.fileMakerService.endpoint;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import gr.fileMakerService.util.Writer;

@WebService(endpointInterface = "gr.fileMakerService.endpoint.FileMakerService")
public class FileMakerServiceImpl implements FileMakerService {

	@Override
	public List<String> message(MessageRequest req) throws Exception {
		List<String> responseList = new ArrayList<>();
		List<File> fileList = req.getFileList();
		
		for (File file : fileList) {
			responseList.add(Writer.write(file.getFileName(), file.getFilePath(), file.getWriteString()));
		}
		
		
		return responseList;
	}

}
