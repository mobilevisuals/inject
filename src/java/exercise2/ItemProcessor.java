package exercise2;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


/**
 *
 * @author nbuser
 */
@Named
@RequestScoped
public class ItemProcessor {
//we add the Inject annotation to the ItemDao field to indicate that this field is an injection point.
    @Inject
    private DefaultItemDao itemDao;

    public void execute() {
        List<Item> items = itemDao.fetchItems();
        for (Item item : items) {
            item.getLimit();//this code is just to have somewhere to put a breakpoint to debug
        }
    }

    public DefaultItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(DefaultItemDao itemDao) {
        this.itemDao = itemDao;
    }
    
    
}
