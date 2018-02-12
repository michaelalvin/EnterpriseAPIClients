/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

const models = require('./index');

/**
 * The Insert Entity Model.
 *
 */
class InsertEntityRequestModel {
  /**
   * Create a InsertEntityRequestModel.
   * @member {array} [profiles] Gets or sets the profiles.
   * @member {number} [acl] Gets or sets the access control list.
   * @member {number} [type] Gets or sets the type.
   * @member {string} name Gets or sets the Name.
   */
  constructor() {
  }

  /**
   * Defines the metadata of InsertEntityRequestModel
   *
   * @returns {object} metadata of InsertEntityRequestModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'InsertEntityRequestModel',
      type: {
        name: 'Composite',
        className: 'InsertEntityRequestModel',
        modelProperties: {
          profiles: {
            required: false,
            serializedName: 'Profiles',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'ProfileModelElementType',
                  type: {
                    name: 'Composite',
                    className: 'ProfileModel'
                  }
              }
            }
          },
          acl: {
            required: false,
            serializedName: 'Acl',
            type: {
              name: 'Number'
            }
          },
          type: {
            required: false,
            serializedName: 'Type',
            constraints: {
              InclusiveMaximum: 2147483647,
              InclusiveMinimum: 1
            },
            type: {
              name: 'Number'
            }
          },
          name: {
            required: true,
            serializedName: 'Name',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = InsertEntityRequestModel;