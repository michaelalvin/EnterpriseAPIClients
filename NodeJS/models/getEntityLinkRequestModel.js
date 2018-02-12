/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Model for the GET Link input parameters
 *
 */
class GetEntityLinkRequestModel {
  /**
   * Create a GetEntityLinkRequestModel.
   * @member {number} [childEntityID] Gets or sets the child entity identifier.
   * @member {number} [childDrawerID] Gets or sets the child drawer identifier.
   * @member {number} [childType] Gets or sets the type of the child.
   * @member {number} [acl] Gets or sets the access control list.
   * @member {number} [entityID] Gets or sets the entity identifier.
   * @member {number} [drawerID] Gets or sets the drawer identifier.
   * @member {string} [name] Gets or sets the name.
   * @member {number} [creatorUserID] Gets or sets the creator user identifier.
   * @member {number} [modifierUserID] Gets or sets the modifier user
   * identifier.
   * @member {date} [minInsertionTime] Gets or sets the minimum insertion time.
   * @member {date} [maxInsertionTime] Gets or sets the maximum insertion time.
   * @member {date} [minModificationTime] Gets or sets the minimum modification
   * time.
   * @member {date} [maxModificationTime] Gets or sets the maximum modification
   * time.
   * @member {number} [page] Gets or sets the page number.
   * @member {number} [pageSize] Gets or sets the size of the page.
   * @member {string} [sortOrder] Gets or sets the order. Possible values
   * include: 'Unspecified', 'Ascending', 'Descending'
   * @member {string} [sortBy] Gets or sets the column to order by. Possible
   * values include: 'PageNumber', 'ID', 'Type', 'InsertionTime',
   * 'ModificationTime', 'CrossReferenceID', 'SubType', 'Extension', 'Name'
   */
  constructor() {
  }

  /**
   * Defines the metadata of GetEntityLinkRequestModel
   *
   * @returns {object} metadata of GetEntityLinkRequestModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'GetEntityLinkRequestModel',
      type: {
        name: 'Composite',
        className: 'GetEntityLinkRequestModel',
        modelProperties: {
          childEntityID: {
            required: false,
            serializedName: 'ChildEntityID',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 1
            },
            type: {
              name: 'Number'
            }
          },
          childDrawerID: {
            required: false,
            serializedName: 'ChildDrawerID',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 1
            },
            type: {
              name: 'Number'
            }
          },
          childType: {
            required: false,
            serializedName: 'ChildType',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 1
            },
            type: {
              name: 'Number'
            }
          },
          acl: {
            required: false,
            serializedName: 'Acl',
            type: {
              name: 'Number'
            }
          },
          entityID: {
            required: false,
            serializedName: 'EntityID',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 1
            },
            type: {
              name: 'Number'
            }
          },
          drawerID: {
            required: false,
            serializedName: 'DrawerID',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 1
            },
            type: {
              name: 'Number'
            }
          },
          name: {
            required: false,
            serializedName: 'Name',
            constraints: {
              MaxLength: 255,
              MinLength: 0
            },
            type: {
              name: 'String'
            }
          },
          creatorUserID: {
            required: false,
            serializedName: 'CreatorUserID',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 1
            },
            type: {
              name: 'Number'
            }
          },
          modifierUserID: {
            required: false,
            serializedName: 'ModifierUserID',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 1
            },
            type: {
              name: 'Number'
            }
          },
          minInsertionTime: {
            required: false,
            serializedName: 'MinInsertionTime',
            type: {
              name: 'DateTime'
            }
          },
          maxInsertionTime: {
            required: false,
            serializedName: 'MaxInsertionTime',
            type: {
              name: 'DateTime'
            }
          },
          minModificationTime: {
            required: false,
            serializedName: 'MinModificationTime',
            type: {
              name: 'DateTime'
            }
          },
          maxModificationTime: {
            required: false,
            serializedName: 'MaxModificationTime',
            type: {
              name: 'DateTime'
            }
          },
          page: {
            required: false,
            serializedName: 'Page',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 1
            },
            type: {
              name: 'Number'
            }
          },
          pageSize: {
            required: false,
            serializedName: 'PageSize',
            constraints: {
              InclusiveMaximum: 1000,
              InclusiveMinimum: 1
            },
            type: {
              name: 'Number'
            }
          },
          sortOrder: {
            required: false,
            serializedName: 'SortOrder',
            type: {
              name: 'String'
            }
          },
          sortBy: {
            required: false,
            serializedName: 'SortBy',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = GetEntityLinkRequestModel;