package IOC.annotation.com.service.userdao;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author LiSDong
 * @ClassName Stu
 * @Description
 * @Date 2022/9/9 21:58
 * @Version 1.0
 */
public class Stu {

        //1 数组类型属性

        private String[] courses;

        //2 list 集合类型属性
        private List<String> list;

        //3 map 集合类型属性

        private Map<String,String> maps;

        //4 set 集合类型属性
        private Set<String> sets;
        public void setSets(Set<String> sets) {
            this.sets = sets;
        }
        public void setCourses(String[] courses) {
            this.courses = courses;
        }
        public void setList(List<String> list) {
            this.list = list;
        }
        public void setMaps(Map<String, String> maps) {
            this.maps = maps;
        }
    }

