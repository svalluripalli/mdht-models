/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProblemActImpl extends ActImpl implements ProblemAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.PROBLEM_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActEntryRelationshipRequired(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemActOperations.validateProblemActEntryRelationshipRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActSubjectOfTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemActOperations.validateProblemActSubjectOfTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActContainsProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemActOperations.validateProblemActContainsProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActContainsAlertObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemActOperations.validateProblemActContainsAlertObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActContainsPatientAwareness(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProblemActOperations.validateProblemActContainsPatientAwareness(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemActOperations.validateProblemActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemActOperations.validateProblemActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemActOperations.validateProblemActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemActOperations.validateProblemActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActCodeNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemActOperations.validateProblemActCodeNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemActOperations.validateProblemActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemActEpisodeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemActOperations.validateProblemActEpisodeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeObservation getEpisodeObservation() {
		return ProblemActOperations.getEpisodeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProblemActImpl
