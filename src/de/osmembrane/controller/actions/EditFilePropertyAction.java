/*
 * This file is part of the OSMembrane project.
 * More informations under www.osmembrane.de
 * 
 * The project is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * for more details about the license see
 * http://www.osmembrane.de/license/
 * 
 * Source: $HeadURL$ ($Revision$)
 * Last changed: $Date$
 */

package de.osmembrane.controller.actions;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

import de.osmembrane.Application;
import de.osmembrane.controller.events.ContainingEvent;
import de.osmembrane.exceptions.ControlledException;
import de.osmembrane.exceptions.ExceptionSeverity;
import de.osmembrane.model.pipeline.AbstractParameter;
import de.osmembrane.tools.I18N;

/**
 * Action to edit a parameter which is a file path and therefore open the file
 * path dialog. Receives a {@link ContainingEvent}.
 * 
 * @author tobias_kuhn
 * 
 */
public class EditFilePropertyAction extends AbstractAction {

	private static final long serialVersionUID = 1481319711002406388L;

	/**
	 * Creates a new {@link EditFilePropertyAction}
	 */
	public EditFilePropertyAction() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ContainingEvent ce = (ContainingEvent) e;
		AbstractParameter ap = (AbstractParameter) ce.getContained();

		JFileChooser fileChooser = new JFileChooser();

		String value = ap.getValue();
		if ((value == null) || (value.isEmpty())) {
			value = ".";
		}
		fileChooser.setSelectedFile(new File(value));

		if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			ap.setValue(fileChooser.getSelectedFile().getAbsolutePath());
		}
	}
}
