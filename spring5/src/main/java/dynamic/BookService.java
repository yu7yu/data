package dynamic;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author LiSDong
 * @ClassName BookService
 * @Description
 * @Date 2022/9/12 18:52
 * @Version 1.0
 */
@Service
public class BookService {
    @Resource()
    private BookDao bookDao;
}
