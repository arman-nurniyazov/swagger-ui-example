package uz.pdp.swaggeruiexample.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;
    
    public Test get(Integer id) {
        return testRepository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("Test not found");
        });
    }

    public Test create(Test Test) {
        return testRepository.save(Test);
    }

    public Test update(Test Test) {
        return testRepository.save(Test);
    }

    public List<Test> getAll() {
        return testRepository.findAll();
    }

    public String delete(Integer id) {
        testRepository.deleteById(id);
        return "Successfully deleted";
    }


}
