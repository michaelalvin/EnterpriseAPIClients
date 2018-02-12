/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Model for the GET Extension input parameters
 *
 */
class GetExtensionRequestModel {
  /**
   * Create a GetExtensionRequestModel.
   * @member {number} drawerID Gets or sets the drawer identifier.
   * @member {number} entityID Gets or sets the entity identifier.
   * @member {number} profileID Gets or sets the profile identifier.
   * @member {number} [id] Gets or sets the extension identifier.
   * @member {number} [type] Gets or sets the type of the extension.
   * @member {number} [page] Gets or sets the page number.
   * @member {number} [pageSize] Gets or sets the size of the page.
   * @member {string} [sortOrder] Gets or sets the order. Possible values
   * include: 'Unspecified', 'Ascending', 'Descending'
   * @member {string} [sortBy] Gets or sets the column to order by. Possible
   * values include: 'RowNumber', 'ID', 'Type', 'String', 'Integer', 'Double',
   * 'Date'
   */
  constructor() {
  }

  /**
   * Defines the metadata of GetExtensionRequestModel
   *
   * @returns {object} metadata of GetExtensionRequestModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'GetExtensionRequestModel',
      type: {
        name: 'Composite',
        className: 'GetExtensionRequestModel',
        modelProperties: {
          drawerID: {
            required: true,
            serializedName: 'DrawerID',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 1
            },
            type: {
              name: 'Number'
            }
          },
          entityID: {
            required: true,
            serializedName: 'EntityID',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 1
            },
            type: {
              name: 'Number'
            }
          },
          profileID: {
            required: true,
            serializedName: 'ProfileID',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 1
            },
            type: {
              name: 'Number'
            }
          },
          id: {
            required: false,
            serializedName: 'ID',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 1
            },
            type: {
              name: 'Number'
            }
          },
          type: {
            required: false,
            serializedName: 'Type',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 0
            },
            type: {
              name: 'Number'
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

module.exports = GetExtensionRequestModel;