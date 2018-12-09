package pe.edu.tecsup.pcc.jpa.viewModel;

import java.util.List;

/**
 * Created by jpizarro on 11/05/2017.
 */
public class primeTreeViewModel {
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public List<primeTreeViewModel> getChildren() {
        return children;
    }

    public void setChildren(List<primeTreeViewModel> children) {
        this.children = children;
    }

    private List<primeTreeViewModel> children;
}
