package menuClasses;

import dataManager.DMComponent;

public class AlterListAction implements Action {

	@Override
	public void execute(Object args) {
		// TODO Auto-generated method stub
			DMComponent dm = (DMComponent) args; 
			dm.getMenuStack().push(AlterListMenu.getAlterListsMenu()); 

	}

}
