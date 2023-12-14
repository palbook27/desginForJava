package com.composite;

public class File extends Component{

    Object data;

    public File(String name) {
        super(name);
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
