# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class GetFieldValidationModel(Model):
    """Model for the GET Template input parameters.

    :param sort_column: Gets or sets the sort column.
    :type sort_column: str
    :param metadata: Gets or sets the metadata search options.
    :type metadata:
     list[~softheon.enterprise.api.client.models.GetLookupFieldModel]
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
        'page': {'maximum': 2147483647, 'minimum': 1},
        'page_size': {'maximum': 1000, 'minimum': 1},
    }

    _attribute_map = {
        'sort_column': {'key': 'SortColumn', 'type': 'str'},
        'metadata': {'key': 'Metadata', 'type': '[GetLookupFieldModel]'},
        'page': {'key': 'Page', 'type': 'int'},
        'page_size': {'key': 'PageSize', 'type': 'int'},
        'sort_order': {'key': 'SortOrder', 'type': 'str'},
        'sort_by': {'key': 'SortBy', 'type': 'int'},
    }

    def __init__(self, sort_column=None, metadata=None, page=None, page_size=None, sort_order=None, sort_by=None):
        super(GetFieldValidationModel, self).__init__()
        self.sort_column = sort_column
        self.metadata = metadata
        self.page = page
        self.page_size = page_size
        self.sort_order = sort_order
        self.sort_by = sort_by