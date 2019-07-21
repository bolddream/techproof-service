package abc.def.ghij;

import org.springframework.stereotype.Service;

@Service
public class TestService2 {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println("Dynamic inject bean,name="+name);
    }
}
