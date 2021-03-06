# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class GroupUserModel(Model):
    """The model that is sent in response to a GET request for GroupUser
    associations.

    :param group_id: Gets or sets the group identifier.
    :type group_id: int
    :param group_name: Gets or sets the name of the group.
    :type group_name: str
    :param user_id: Gets or sets the user identifier.
    :type user_id: int
    :param user_full_name: Gets or sets the full name of the user.
    :type user_full_name: str
    """

    _validation = {
        'group_name': {'max_length': 255, 'min_length': 0},
        'user_full_name': {'max_length': 255, 'min_length': 0},
    }

    _attribute_map = {
        'group_id': {'key': 'GroupID', 'type': 'int'},
        'group_name': {'key': 'GroupName', 'type': 'str'},
        'user_id': {'key': 'UserID', 'type': 'int'},
        'user_full_name': {'key': 'UserFullName', 'type': 'str'},
    }

    def __init__(self, group_id=None, group_name=None, user_id=None, user_full_name=None):
        super(GroupUserModel, self).__init__()
        self.group_id = group_id
        self.group_name = group_name
        self.user_id = user_id
        self.user_full_name = user_full_name
