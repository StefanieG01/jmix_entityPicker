package com.company.entitypicker.view.otherentity;

import com.company.entitypicker.entity.OtherEntity;
import com.company.entitypicker.entity.User;
import com.company.entitypicker.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.valuepicker.EntityPicker;
import io.jmix.flowui.view.*;

@Route(value = "otherEntities/:id", layout = MainView.class)
@ViewController("OtherEntity.detail")
@ViewDescriptor("other-entity-detail-view.xml")
@EditedEntityContainer("otherEntityDc")
public class OtherEntityDetailView extends StandardDetailView<OtherEntity>
{
    @ViewComponent
    private EntityPicker<User> userField;

    @Subscribe("userField")
    public void onUserFieldComponentValueChange(
            final AbstractField.ComponentValueChangeEvent<EntityPicker<User>, User> event)
    {

        if(userField.getValue() != null && !event.getValue().getActive())
        {
            userField.clear();
            //userField.setValue(null);
            //getEditedEntity().setUserID(null);
        }
    }
}