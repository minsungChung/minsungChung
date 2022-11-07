package wjm.wjmproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wjm.wjmproject.domain.Restaurant;
import wjm.wjmproject.repository.TestRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public List<Restaurant> findByAllArea(String area){
        List<Restaurant> result = testRepository.findAllByArea(area);
        System.out.println("#######"+result);
        return result;
    }
}
