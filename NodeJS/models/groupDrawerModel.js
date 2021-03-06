/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * The model that is sent in response to a GET request for GroupsDrawer
 * associations
 *
 */
class GroupDrawerModel {
  /**
   * Create a GroupDrawerModel.
   * @member {number} [groupID] Gets or sets the group identifier.
   * @member {string} [groupName] Gets or sets the name of the group.
   * @member {number} [drawerID] Gets or sets the drawer identifier.
   * @member {string} [drawerName] Gets or sets the name of the drawer.
   * @member {number} [acl] Gets or sets the access control level permissions.
   */
  constructor() {
  }

  /**
   * Defines the metadata of GroupDrawerModel
   *
   * @returns {object} metadata of GroupDrawerModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'GroupDrawerModel',
      type: {
        name: 'Composite',
        className: 'GroupDrawerModel',
        modelProperties: {
          groupID: {
            required: false,
            serializedName: 'GroupID',
            type: {
              name: 'Number'
            }
          },
          groupName: {
            required: false,
            serializedName: 'GroupName',
            constraints: {
              MaxLength: 255,
              MinLength: 0
            },
            type: {
              name: 'String'
            }
          },
          drawerID: {
            required: false,
            serializedName: 'DrawerID',
            type: {
              name: 'Number'
            }
          },
          drawerName: {
            required: false,
            serializedName: 'DrawerName',
            constraints: {
              MaxLength: 255,
              MinLength: 0
            },
            type: {
              name: 'String'
            }
          },
          acl: {
            required: false,
            serializedName: 'Acl',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = GroupDrawerModel;
