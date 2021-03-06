/*******************************************************************************
 * Copyright (c) 2011, 2012 David A. Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainFactory
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/apitest/domain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IStatusObservationImpl <em>IStatus Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIStatusObservation()
	 * @generated
	 */
	int ISTATUS_OBSERVATION = 0;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATUS_OBSERVATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>IStatus Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATUS_OBSERVATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IConditionImpl <em>ICondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IConditionImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getICondition()
	 * @generated
	 */
	int ICONDITION = 1;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONDITION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>ICondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IEpisodeObservationImpl <em>IEpisode Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IEpisodeObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIEpisodeObservation()
	 * @generated
	 */
	int IEPISODE_OBSERVATION = 2;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPISODE_OBSERVATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>IEpisode Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEPISODE_OBSERVATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IProblemEntryImpl <em>IProblem Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IProblemEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIProblemEntry()
	 * @generated
	 */
	int IPROBLEM_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROBLEM_ENTRY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>IProblem Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROBLEM_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IAgeObservationImpl <em>IAge Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IAgeObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIAgeObservation()
	 * @generated
	 */
	int IAGE_OBSERVATION = 4;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAGE_OBSERVATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>IAge Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAGE_OBSERVATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ISeverityImpl <em>ISeverity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ISeverityImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getISeverity()
	 * @generated
	 */
	int ISEVERITY = 5;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISEVERITY__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>ISeverity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISEVERITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IProblemStatusObservationImpl <em>IProblem Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IProblemStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIProblemStatusObservation()
	 * @generated
	 */
	int IPROBLEM_STATUS_OBSERVATION = 6;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROBLEM_STATUS_OBSERVATION__CDA_TYPE = ISTATUS_OBSERVATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>IProblem Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROBLEM_STATUS_OBSERVATION_FEATURE_COUNT = ISTATUS_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IHealthStatusObservationImpl <em>IHealth Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IHealthStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIHealthStatusObservation()
	 * @generated
	 */
	int IHEALTH_STATUS_OBSERVATION = 7;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHEALTH_STATUS_OBSERVATION__CDA_TYPE = ISTATUS_OBSERVATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>IHealth Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHEALTH_STATUS_OBSERVATION_FEATURE_COUNT = ISTATUS_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ICommentImpl <em>IComment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ICommentImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIComment()
	 * @generated
	 */
	int ICOMMENT = 8;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMENT__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>IComment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IFamilyHistoryObservationImpl <em>IFamily History Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IFamilyHistoryObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIFamilyHistoryObservation()
	 * @generated
	 */
	int IFAMILY_HISTORY_OBSERVATION = 10;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFAMILY_HISTORY_OBSERVATION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>IFamily History Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFAMILY_HISTORY_OBSERVATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ICauseOfDeathObservationImpl <em>ICause Of Death Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ICauseOfDeathObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getICauseOfDeathObservation()
	 * @generated
	 */
	int ICAUSE_OF_DEATH_OBSERVATION = 9;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICAUSE_OF_DEATH_OBSERVATION__CDA_TYPE = IFAMILY_HISTORY_OBSERVATION__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>ICause Of Death Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICAUSE_OF_DEATH_OBSERVATION_FEATURE_COUNT = IFAMILY_HISTORY_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ITreatingProviderImpl <em>ITreating Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ITreatingProviderImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getITreatingProvider()
	 * @generated
	 */
	int ITREATING_PROVIDER = 11;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITREATING_PROVIDER__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>ITreating Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITREATING_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IProblemListSectionImpl <em>IProblem List Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IProblemListSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIProblemListSection()
	 * @generated
	 */
	int IPROBLEM_LIST_SECTION = 12;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROBLEM_LIST_SECTION__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>IProblem List Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROBLEM_LIST_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IGeneralHeaderConstraintsImpl <em>IGeneral Header Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IGeneralHeaderConstraintsImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIGeneralHeaderConstraints()
	 * @generated
	 */
	int IGENERAL_HEADER_CONSTRAINTS = 14;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGENERAL_HEADER_CONSTRAINTS__CDA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>IGeneral Header Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IPatientSummaryImpl <em>IPatient Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IPatientSummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIPatientSummary()
	 * @generated
	 */
	int IPATIENT_SUMMARY = 13;

	/**
	 * The feature id for the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPATIENT_SUMMARY__CDA_TYPE = IGENERAL_HEADER_CONSTRAINTS__CDA_TYPE;

	/**
	 * The number of structural features of the '<em>IPatient Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPATIENT_SUMMARY_FEATURE_COUNT = IGENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IStatusObservation <em>IStatus Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IStatus Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IStatusObservation
	 * @generated
	 */
	EClass getIStatusObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IStatusObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IStatusObservation#getCDAType()
	 * @see #getIStatusObservation()
	 * @generated
	 */
	EReference getIStatusObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition <em>ICondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICondition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition
	 * @generated
	 */
	EClass getICondition();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#getCDAType()
	 * @see #getICondition()
	 * @generated
	 */
	EReference getICondition_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IEpisodeObservation <em>IEpisode Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEpisode Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IEpisodeObservation
	 * @generated
	 */
	EClass getIEpisodeObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IEpisodeObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IEpisodeObservation#getCDAType()
	 * @see #getIEpisodeObservation()
	 * @generated
	 */
	EReference getIEpisodeObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry <em>IProblem Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProblem Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry
	 * @generated
	 */
	EClass getIProblemEntry();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#getCDAType()
	 * @see #getIProblemEntry()
	 * @generated
	 */
	EReference getIProblemEntry_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation <em>IAge Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAge Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation
	 * @generated
	 */
	EClass getIAgeObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation#getCDAType()
	 * @see #getIAgeObservation()
	 * @generated
	 */
	EReference getIAgeObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ISeverity <em>ISeverity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISeverity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ISeverity
	 * @generated
	 */
	EClass getISeverity();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ISeverity#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ISeverity#getCDAType()
	 * @see #getISeverity()
	 * @generated
	 */
	EReference getISeverity_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemStatusObservation <em>IProblem Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProblem Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemStatusObservation
	 * @generated
	 */
	EClass getIProblemStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IHealthStatusObservation <em>IHealth Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHealth Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IHealthStatusObservation
	 * @generated
	 */
	EClass getIHealthStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IComment <em>IComment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IComment</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IComment
	 * @generated
	 */
	EClass getIComment();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IComment#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IComment#getCDAType()
	 * @see #getIComment()
	 * @generated
	 */
	EReference getIComment_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICauseOfDeathObservation <em>ICause Of Death Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICause Of Death Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ICauseOfDeathObservation
	 * @generated
	 */
	EClass getICauseOfDeathObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation <em>IFamily History Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFamily History Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation
	 * @generated
	 */
	EClass getIFamilyHistoryObservation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation#getCDAType()
	 * @see #getIFamilyHistoryObservation()
	 * @generated
	 */
	EReference getIFamilyHistoryObservation_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider <em>ITreating Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITreating Provider</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider
	 * @generated
	 */
	EClass getITreatingProvider();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider#getCDAType()
	 * @see #getITreatingProvider()
	 * @generated
	 */
	EReference getITreatingProvider_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemListSection <em>IProblem List Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProblem List Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemListSection
	 * @generated
	 */
	EClass getIProblemListSection();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemListSection#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemListSection#getCDAType()
	 * @see #getIProblemListSection()
	 * @generated
	 */
	EReference getIProblemListSection_CDAType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IPatientSummary <em>IPatient Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPatient Summary</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IPatientSummary
	 * @generated
	 */
	EClass getIPatientSummary();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints <em>IGeneral Header Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IGeneral Header Constraints</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints
	 * @generated
	 */
	EClass getIGeneralHeaderConstraints();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getCDAType <em>CDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CDA Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getCDAType()
	 * @see #getIGeneralHeaderConstraints()
	 * @generated
	 */
	EReference getIGeneralHeaderConstraints_CDAType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IStatusObservationImpl <em>IStatus Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IStatusObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIStatusObservation()
		 * @generated
		 */
		EClass ISTATUS_OBSERVATION = eINSTANCE.getIStatusObservation();

		/**
		 * The meta object literal for the '<em><b>CDA Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTATUS_OBSERVATION__CDA_TYPE = eINSTANCE.getIStatusObservation_CDAType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IConditionImpl <em>ICondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IConditionImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getICondition()
		 * @generated
		 */
		EClass ICONDITION = eINSTANCE.getICondition();

		/**
		 * The meta object literal for the '<em><b>CDA Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICONDITION__CDA_TYPE = eINSTANCE.getICondition_CDAType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IEpisodeObservationImpl <em>IEpisode Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IEpisodeObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIEpisodeObservation()
		 * @generated
		 */
		EClass IEPISODE_OBSERVATION = eINSTANCE.getIEpisodeObservation();

		/**
		 * The meta object literal for the '<em><b>CDA Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEPISODE_OBSERVATION__CDA_TYPE = eINSTANCE.getIEpisodeObservation_CDAType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IProblemEntryImpl <em>IProblem Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IProblemEntryImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIProblemEntry()
		 * @generated
		 */
		EClass IPROBLEM_ENTRY = eINSTANCE.getIProblemEntry();

		/**
		 * The meta object literal for the '<em><b>CDA Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IPROBLEM_ENTRY__CDA_TYPE = eINSTANCE.getIProblemEntry_CDAType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IAgeObservationImpl <em>IAge Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IAgeObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIAgeObservation()
		 * @generated
		 */
		EClass IAGE_OBSERVATION = eINSTANCE.getIAgeObservation();

		/**
		 * The meta object literal for the '<em><b>CDA Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IAGE_OBSERVATION__CDA_TYPE = eINSTANCE.getIAgeObservation_CDAType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ISeverityImpl <em>ISeverity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ISeverityImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getISeverity()
		 * @generated
		 */
		EClass ISEVERITY = eINSTANCE.getISeverity();

		/**
		 * The meta object literal for the '<em><b>CDA Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISEVERITY__CDA_TYPE = eINSTANCE.getISeverity_CDAType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IProblemStatusObservationImpl <em>IProblem Status Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IProblemStatusObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIProblemStatusObservation()
		 * @generated
		 */
		EClass IPROBLEM_STATUS_OBSERVATION = eINSTANCE.getIProblemStatusObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IHealthStatusObservationImpl <em>IHealth Status Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IHealthStatusObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIHealthStatusObservation()
		 * @generated
		 */
		EClass IHEALTH_STATUS_OBSERVATION = eINSTANCE.getIHealthStatusObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ICommentImpl <em>IComment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ICommentImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIComment()
		 * @generated
		 */
		EClass ICOMMENT = eINSTANCE.getIComment();

		/**
		 * The meta object literal for the '<em><b>CDA Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICOMMENT__CDA_TYPE = eINSTANCE.getIComment_CDAType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ICauseOfDeathObservationImpl <em>ICause Of Death Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ICauseOfDeathObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getICauseOfDeathObservation()
		 * @generated
		 */
		EClass ICAUSE_OF_DEATH_OBSERVATION = eINSTANCE.getICauseOfDeathObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IFamilyHistoryObservationImpl <em>IFamily History Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IFamilyHistoryObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIFamilyHistoryObservation()
		 * @generated
		 */
		EClass IFAMILY_HISTORY_OBSERVATION = eINSTANCE.getIFamilyHistoryObservation();

		/**
		 * The meta object literal for the '<em><b>CDA Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFAMILY_HISTORY_OBSERVATION__CDA_TYPE = eINSTANCE.getIFamilyHistoryObservation_CDAType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ITreatingProviderImpl <em>ITreating Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ITreatingProviderImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getITreatingProvider()
		 * @generated
		 */
		EClass ITREATING_PROVIDER = eINSTANCE.getITreatingProvider();

		/**
		 * The meta object literal for the '<em><b>CDA Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITREATING_PROVIDER__CDA_TYPE = eINSTANCE.getITreatingProvider_CDAType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IProblemListSectionImpl <em>IProblem List Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IProblemListSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIProblemListSection()
		 * @generated
		 */
		EClass IPROBLEM_LIST_SECTION = eINSTANCE.getIProblemListSection();

		/**
		 * The meta object literal for the '<em><b>CDA Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IPROBLEM_LIST_SECTION__CDA_TYPE = eINSTANCE.getIProblemListSection_CDAType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IPatientSummaryImpl <em>IPatient Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IPatientSummaryImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIPatientSummary()
		 * @generated
		 */
		EClass IPATIENT_SUMMARY = eINSTANCE.getIPatientSummary();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IGeneralHeaderConstraintsImpl <em>IGeneral Header Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IGeneralHeaderConstraintsImpl
		 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.impl.DomainPackageImpl#getIGeneralHeaderConstraints()
		 * @generated
		 */
		EClass IGENERAL_HEADER_CONSTRAINTS = eINSTANCE.getIGeneralHeaderConstraints();

		/**
		 * The meta object literal for the '<em><b>CDA Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IGENERAL_HEADER_CONSTRAINTS__CDA_TYPE = eINSTANCE.getIGeneralHeaderConstraints_CDAType();

	}

} // DomainPackage
