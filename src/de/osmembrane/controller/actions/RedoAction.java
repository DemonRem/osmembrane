package de.osmembrane.controller.actions;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;

import de.osmembrane.model.ModelProxy;
import de.osmembrane.resources.Resource;
import de.osmembrane.tools.I18N;
import de.osmembrane.tools.IconLoader.Size;

/**
 * Action to redo the last undone edit in the pipeline.
 * 
 * @author tobias_kuhn
 * 
 */
public class RedoAction extends AbstractAction {

	private static final long serialVersionUID = 5665756570061846480L;

	/**
	 * Creates a new {@link RedoAction}
	 */
	public RedoAction() {
		putValue(Action.NAME,
				I18N.getInstance().getString("Controller.Actions.Redo.Name"));
		putValue(
				Action.SHORT_DESCRIPTION,
				I18N.getInstance().getString(
						"Controller.Actions.Redo.Description"));
		putValue(Action.SMALL_ICON,
				Resource.PROGRAM_ICON.getImageIcon("redo.png", Size.SMALL));
		putValue(Action.LARGE_ICON_KEY,
				Resource.PROGRAM_ICON.getImageIcon("redo.png", Size.NORMAL));
		putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_Y,
				Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
		setEnabled(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ModelProxy.getInstance().getPipeline().redo();
	}
}