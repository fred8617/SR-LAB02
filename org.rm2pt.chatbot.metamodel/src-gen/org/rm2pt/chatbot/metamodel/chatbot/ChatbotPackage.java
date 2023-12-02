/**
 */
package org.rm2pt.chatbot.metamodel.chatbot;

import org.eclipse.emf.ecore.EAttribute;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.rm2pt.chatbot.metamodel.chatbot.ChatbotFactory
 * @model kind="package"
 * @generated
 */
public interface ChatbotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chatbot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rm2pt.com/chatbot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chatbot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChatbotPackage eINSTANCE = org.rm2pt.chatbot.metamodel.chatbot.impl.ChatbotPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.rm2pt.chatbot.metamodel.chatbot.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.AdminImpl
	 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.ChatbotPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 0;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.chatbot.metamodel.chatbot.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.UserImpl
	 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.ChatbotPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = ADMIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chat</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CHAT = ADMIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ADMIN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ADMIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.chatbot.metamodel.chatbot.impl.ChatImpl <em>Chat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.ChatImpl
	 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.ChatbotPackageImpl#getChat()
	 * @generated
	 */
	int CHAT = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Chat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Chat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.chatbot.metamodel.chatbot.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.MessageImpl
	 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.ChatbotPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.chatbot.metamodel.chatbot.impl.NormalUserImpl <em>Normal User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.NormalUserImpl
	 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.ChatbotPackageImpl#getNormalUser()
	 * @generated
	 */
	int NORMAL_USER = 4;

	/**
	 * The number of structural features of the '<em>Normal User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_USER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Normal User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_USER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.rm2pt.chatbot.metamodel.chatbot.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see org.rm2pt.chatbot.metamodel.chatbot.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.chatbot.metamodel.chatbot.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.rm2pt.chatbot.metamodel.chatbot.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.chatbot.metamodel.chatbot.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.chatbot.metamodel.chatbot.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.rm2pt.chatbot.metamodel.chatbot.User#getChat <em>Chat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Chat</em>'.
	 * @see org.rm2pt.chatbot.metamodel.chatbot.User#getChat()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Chat();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.chatbot.metamodel.chatbot.Chat <em>Chat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chat</em>'.
	 * @see org.rm2pt.chatbot.metamodel.chatbot.Chat
	 * @generated
	 */
	EClass getChat();

	/**
	 * Returns the meta object for the reference list '{@link org.rm2pt.chatbot.metamodel.chatbot.Chat#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message</em>'.
	 * @see org.rm2pt.chatbot.metamodel.chatbot.Chat#getMessage()
	 * @see #getChat()
	 * @generated
	 */
	EReference getChat_Message();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.chatbot.metamodel.chatbot.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.rm2pt.chatbot.metamodel.chatbot.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.chatbot.metamodel.chatbot.Message#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.rm2pt.chatbot.metamodel.chatbot.Message#getContent()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.chatbot.metamodel.chatbot.Message#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.rm2pt.chatbot.metamodel.chatbot.Message#getType()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Type();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.chatbot.metamodel.chatbot.NormalUser <em>Normal User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal User</em>'.
	 * @see org.rm2pt.chatbot.metamodel.chatbot.NormalUser
	 * @generated
	 */
	EClass getNormalUser();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChatbotFactory getChatbotFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.rm2pt.chatbot.metamodel.chatbot.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.AdminImpl
		 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.ChatbotPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '{@link org.rm2pt.chatbot.metamodel.chatbot.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.UserImpl
		 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.ChatbotPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>Chat</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__CHAT = eINSTANCE.getUser_Chat();

		/**
		 * The meta object literal for the '{@link org.rm2pt.chatbot.metamodel.chatbot.impl.ChatImpl <em>Chat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.ChatImpl
		 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.ChatbotPackageImpl#getChat()
		 * @generated
		 */
		EClass CHAT = eINSTANCE.getChat();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAT__MESSAGE = eINSTANCE.getChat_Message();

		/**
		 * The meta object literal for the '{@link org.rm2pt.chatbot.metamodel.chatbot.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.MessageImpl
		 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.ChatbotPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__CONTENT = eINSTANCE.getMessage_Content();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TYPE = eINSTANCE.getMessage_Type();

		/**
		 * The meta object literal for the '{@link org.rm2pt.chatbot.metamodel.chatbot.impl.NormalUserImpl <em>Normal User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.NormalUserImpl
		 * @see org.rm2pt.chatbot.metamodel.chatbot.impl.ChatbotPackageImpl#getNormalUser()
		 * @generated
		 */
		EClass NORMAL_USER = eINSTANCE.getNormalUser();

	}

} //ChatbotPackage
