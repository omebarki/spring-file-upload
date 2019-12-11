package omar.mebarki.upload.service;

import omar.mebarki.model.FileModel;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {

    void init();

    void store(MultipartFile file);

    Stream<FileModel> loadAll();

    Path load(String filename);

    Resource loadAsResource(String filename);

    void deleteAll();

}