package com.company.entitypicker.view.otherentity;

import com.company.entitypicker.entity.OtherEntity;
import com.company.entitypicker.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "otherEntities", layout = MainView.class)
@ViewController("OtherEntity.list")
@ViewDescriptor("other-entity-list-view.xml")
@LookupComponent("otherEntitiesDataGrid")
@DialogMode(width = "64em")
public class OtherEntityListView extends StandardListView<OtherEntity>
{}