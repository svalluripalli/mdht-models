/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ihe.CombinationMedication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Combination Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getMedicationCombinationMedication()
 * @model
 * @generated
 */
public interface MedicationCombinationMedication extends CombinationMedication, Medication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationCombinationMedication init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationCombinationMedication init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // MedicationCombinationMedication
