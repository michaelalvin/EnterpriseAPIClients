# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class GroupModel(Model):
    """The model that is sent in response to a GET request for Groups.

    :param id: Gets or sets the group identifier.
    :type id: int
    :param queue_count: Gets or sets the queue count.
    :type queue_count: int
    :param user_count: Gets or sets the user count.
    :type user_count: int
    :param user_id: Gets or sets the user identifier.
    :type user_id: int
    :param name: Gets or sets the name.
    :type name: str
    :param type: Gets or sets the type. Possible values include: 'Generic',
     'Access', 'Role'
    :type type: str or ~softheon.enterprise.api.client.models.enum
    :param state: Gets or sets the state. Possible values include: 'Inactive',
     'Active'
    :type state: str or ~softheon.enterprise.api.client.models.enum
    :param reserved_int1: Gets or sets the reserved int1.
    :type reserved_int1: int
    :param reserved_int2: Gets or sets the reserved int2.
    :type reserved_int2: int
    :param reserved_string1: Gets or sets the reserved string1.
    :type reserved_string1: str
    :param reserved_string2: Gets or sets the reserved string2.
    :type reserved_string2: str
    """

    _validation = {
        'name': {'required': True, 'max_length': 255, 'min_length': 0},
        'reserved_string1': {'max_length': 255, 'min_length': 0},
        'reserved_string2': {'max_length': 255, 'min_length': 0},
    }

    _attribute_map = {
        'id': {'key': 'ID', 'type': 'int'},
        'queue_count': {'key': 'QueueCount', 'type': 'int'},
        'user_count': {'key': 'UserCount', 'type': 'int'},
        'user_id': {'key': 'UserID', 'type': 'int'},
        'name': {'key': 'Name', 'type': 'str'},
        'type': {'key': 'Type', 'type': 'str'},
        'state': {'key': 'State', 'type': 'str'},
        'reserved_int1': {'key': 'ReservedInt1', 'type': 'int'},
        'reserved_int2': {'key': 'ReservedInt2', 'type': 'int'},
        'reserved_string1': {'key': 'ReservedString1', 'type': 'str'},
        'reserved_string2': {'key': 'ReservedString2', 'type': 'str'},
    }

    def __init__(self, name, id=None, queue_count=None, user_count=None, user_id=None, type=None, state=None, reserved_int1=None, reserved_int2=None, reserved_string1=None, reserved_string2=None):
        super(GroupModel, self).__init__()
        self.id = id
        self.queue_count = queue_count
        self.user_count = user_count
        self.user_id = user_id
        self.name = name
        self.type = type
        self.state = state
        self.reserved_int1 = reserved_int1
        self.reserved_int2 = reserved_int2
        self.reserved_string1 = reserved_string1
        self.reserved_string2 = reserved_string2