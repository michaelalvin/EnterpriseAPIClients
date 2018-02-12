/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Model for the GET Lookup Fields input parameters
 *
 */
class GetLookupFieldModel {
  /**
   * Create a GetLookupFieldModel.
   * @member {string} [columnName] Gets or sets the name of the column.
   * @member {string} [columnValue] Gets or sets the column value.
   */
  constructor() {
  }

  /**
   * Defines the metadata of GetLookupFieldModel
   *
   * @returns {object} metadata of GetLookupFieldModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'GetLookupFieldModel',
      type: {
        name: 'Composite',
        className: 'GetLookupFieldModel',
        modelProperties: {
          columnName: {
            required: false,
            serializedName: 'ColumnName',
            type: {
              name: 'String'
            }
          },
          columnValue: {
            required: false,
            serializedName: 'ColumnValue',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = GetLookupFieldModel;