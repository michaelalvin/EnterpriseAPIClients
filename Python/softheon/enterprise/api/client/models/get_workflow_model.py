# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class GetWorkflowModel(Model):
    """Model for the GET Workflow input parameters.

    :param application_id: Gets or sets the application identifier.
    :type application_id: int
    :param entity_type: Gets or sets the type of the entity.
    :type entity_type: int
    :param name: Gets or sets the name.
    :type name: str
    :param page: Gets or sets the page number.
    :type page: int
    :param page_size: Gets or sets the size of the page.
    :type page_size: int
    :param sort_order: Gets or sets the order. Possible values include:
     'Unspecified', 'Ascending', 'Descending'
    :type sort_order: str or ~softheon.enterprise.api.client.models.enum
    :param sort_by: Gets or sets the column to order by.
    :type sort_by: int
    """

    _validation = {
        'application_id': {'maximum': 2147483647, 'minimum': 1},
        'entity_type': {'maximum': 2147483647, 'minimum': 1},
        'name': {'max_length': 255, 'min_length': 0},
        'page': {'maximum': 2147483647, 'minimum': 1},
        'page_size': {'maximum': 1000, 'minimum': 1},
    }

    _attribute_map = {
        'application_id': {'key': 'ApplicationID', 'type': 'int'},
        'entity_type': {'key': 'EntityType', 'type': 'int'},
        'name': {'key': 'Name', 'type': 'str'},
        'page': {'key': 'Page', 'type': 'int'},
        'page_size': {'key': 'PageSize', 'type': 'int'},
        'sort_order': {'key': 'SortOrder', 'type': 'str'},
        'sort_by': {'key': 'SortBy', 'type': 'int'},
    }

    def __init__(self, application_id=None, entity_type=None, name=None, page=None, page_size=None, sort_order=None, sort_by=None):
        super(GetWorkflowModel, self).__init__()
        self.application_id = application_id
        self.entity_type = entity_type
        self.name = name
        self.page = page
        self.page_size = page_size
        self.sort_order = sort_order
        self.sort_by = sort_by
