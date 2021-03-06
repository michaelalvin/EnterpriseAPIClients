# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class UserModel(Model):
    """The model that is sent in response to a GET request for Users.

    :param id: Gets or sets the identifier.
    :type id: int
    :param username: Gets or sets the username.
    :type username: str
    :param login_count: Gets or sets the login count.
    :type login_count: int
    :param drawer_count: Gets or sets the drawer count.
    :type drawer_count: int
    :param group_count: Gets or sets the group count.
    :type group_count: int
    :param queue_count: Gets or sets the queue count.
    :type queue_count: int
    :param login_time: Gets or sets the login time.
    :type login_time: int
    :param last_login: Gets or sets the last login.
    :type last_login: datetime
    :param primary_group_id: Gets or sets the primary group identifier.
    :type primary_group_id: int
    :param type: Gets or sets the type. Possible values include: 'ImageDesk',
     'PublishDesk', 'FaxDesk', 'CaptureDesk', 'RecognitionDesk', 'PortalUser',
     'AdminDesk', 'WorkflowDesk', 'Benchmark', 'ReportDesk', 'ColdDesk',
     'PortalDesk', 'WorkflowArchitect', 'DocumentDesk', 'Poweruser'
    :type type: str or ~softheon.enterprise.api.client.models.enum
    :param state: Gets or sets the state. Possible values include: 'Active',
     'Inactive'
    :type state: str or ~softheon.enterprise.api.client.models.enum
    :param full_name: Gets or sets the full name.
    :type full_name: str
    :param object_count: Gets or sets the object count.
    :type object_count: int
    :param ip_address: Gets or sets the ip address.
    :type ip_address: str
    :param entity_acl: Gets or sets the entity acl.
    :type entity_acl: int
    :param attachment_acl: Gets or sets the attachment acl.
    :type attachment_acl: int
    :param note_acl: Gets or sets the note acl.
    :type note_acl: int
    :param entity_feature: Gets or sets the entity feature.
    :type entity_feature: int
    :param attachment_feature: Gets or sets the attachment feature.
    :type attachment_feature: int
    :param note_feature: Gets or sets the note feature.
    :type note_feature: int
    :param admin_mask: Gets or sets the admin mask. Possible values include:
     'None', 'CabinetAdmin', 'DrawerAdmin', 'GroupAdmin', 'UserAdmin',
     'WorkflowAdmin', 'VersionAdmin', 'TemplateAdmin', 'ApplicationAdmin'
    :type admin_mask: str or ~softheon.enterprise.api.client.models.enum
    :param address: Gets or sets the address.
    :type address: str
    :param reserved_int1: Gets or sets the reserved int1.
    :type reserved_int1: int
    :param reserved_int2: Gets or sets the reserved int2.
    :type reserved_int2: int
    :param reserved_double1: Gets or sets the reserved double1.
    :type reserved_double1: float
    :param reserved_double2: Gets or sets the reserved double2.
    :type reserved_double2: float
    :param reserved_string1: Gets or sets the reserved string1.
    :type reserved_string1: str
    :param reserved_string2: Gets or sets the reserved string2.
    :type reserved_string2: str
    :param user_expiration: Gets or sets the user expiration.
    :type user_expiration: datetime
    """

    _validation = {
        'primary_group_id': {'maximum': 2147483647, 'minimum': 0},
        'full_name': {'max_length': 255, 'min_length': 0},
        'object_count': {'maximum': 2147483647, 'minimum': 0},
        'ip_address': {'max_length': 255, 'min_length': 0},
        'address': {'max_length': 255, 'min_length': 0},
        'reserved_string1': {'max_length': 128, 'min_length': 0},
        'reserved_string2': {'max_length': 128, 'min_length': 0},
    }

    _attribute_map = {
        'id': {'key': 'ID', 'type': 'int'},
        'username': {'key': 'Username', 'type': 'str'},
        'login_count': {'key': 'LoginCount', 'type': 'int'},
        'drawer_count': {'key': 'DrawerCount', 'type': 'int'},
        'group_count': {'key': 'GroupCount', 'type': 'int'},
        'queue_count': {'key': 'QueueCount', 'type': 'int'},
        'login_time': {'key': 'LoginTime', 'type': 'int'},
        'last_login': {'key': 'LastLogin', 'type': 'iso-8601'},
        'primary_group_id': {'key': 'PrimaryGroupID', 'type': 'int'},
        'type': {'key': 'Type', 'type': 'str'},
        'state': {'key': 'State', 'type': 'str'},
        'full_name': {'key': 'FullName', 'type': 'str'},
        'object_count': {'key': 'ObjectCount', 'type': 'int'},
        'ip_address': {'key': 'IPAddress', 'type': 'str'},
        'entity_acl': {'key': 'EntityAcl', 'type': 'int'},
        'attachment_acl': {'key': 'AttachmentAcl', 'type': 'int'},
        'note_acl': {'key': 'NoteAcl', 'type': 'int'},
        'entity_feature': {'key': 'EntityFeature', 'type': 'int'},
        'attachment_feature': {'key': 'AttachmentFeature', 'type': 'int'},
        'note_feature': {'key': 'NoteFeature', 'type': 'int'},
        'admin_mask': {'key': 'AdminMask', 'type': 'str'},
        'address': {'key': 'Address', 'type': 'str'},
        'reserved_int1': {'key': 'ReservedInt1', 'type': 'int'},
        'reserved_int2': {'key': 'ReservedInt2', 'type': 'int'},
        'reserved_double1': {'key': 'ReservedDouble1', 'type': 'float'},
        'reserved_double2': {'key': 'ReservedDouble2', 'type': 'float'},
        'reserved_string1': {'key': 'ReservedString1', 'type': 'str'},
        'reserved_string2': {'key': 'ReservedString2', 'type': 'str'},
        'user_expiration': {'key': 'UserExpiration', 'type': 'iso-8601'},
    }

    def __init__(self, id=None, username=None, login_count=None, drawer_count=None, group_count=None, queue_count=None, login_time=None, last_login=None, primary_group_id=None, type=None, state=None, full_name=None, object_count=None, ip_address=None, entity_acl=None, attachment_acl=None, note_acl=None, entity_feature=None, attachment_feature=None, note_feature=None, admin_mask=None, address=None, reserved_int1=None, reserved_int2=None, reserved_double1=None, reserved_double2=None, reserved_string1=None, reserved_string2=None, user_expiration=None):
        super(UserModel, self).__init__()
        self.id = id
        self.username = username
        self.login_count = login_count
        self.drawer_count = drawer_count
        self.group_count = group_count
        self.queue_count = queue_count
        self.login_time = login_time
        self.last_login = last_login
        self.primary_group_id = primary_group_id
        self.type = type
        self.state = state
        self.full_name = full_name
        self.object_count = object_count
        self.ip_address = ip_address
        self.entity_acl = entity_acl
        self.attachment_acl = attachment_acl
        self.note_acl = note_acl
        self.entity_feature = entity_feature
        self.attachment_feature = attachment_feature
        self.note_feature = note_feature
        self.admin_mask = admin_mask
        self.address = address
        self.reserved_int1 = reserved_int1
        self.reserved_int2 = reserved_int2
        self.reserved_double1 = reserved_double1
        self.reserved_double2 = reserved_double2
        self.reserved_string1 = reserved_string1
        self.reserved_string2 = reserved_string2
        self.user_expiration = user_expiration
