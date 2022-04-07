package uz.pdp.swaggeruiexample.test;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public record TestController(TestService testService) {

    @GetMapping("/{id}")
    public Test get(@PathVariable Integer id) {
        return testService.get(id);
    }

    @PostMapping("")
    public Test create(@RequestBody Test Test) {
        return testService.create(Test);
    }

    @PutMapping("")
    public Test update(@RequestBody Test Test) {
        return testService.update(Test);
    }


    @GetMapping("")
    public List<Test> getAll() {
        return testService.getAll();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        return testService.delete(id);
    }

}
