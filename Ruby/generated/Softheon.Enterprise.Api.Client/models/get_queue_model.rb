# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Softheon.Enterprise.Api.Client
  module Models
    #
    # Defines the criteria to perform a query on queues
    #
    class GetQueueModel
      # @return [Integer] Gets or sets the queue identifier.
      attr_accessor :id

      # @return [String] Gets or sets the name.
      attr_accessor :name

      # @return [String] Gets or sets the alias.
      attr_accessor :alias_property

      # @return [Enum] Gets or sets the type. Possible values include:
      # 'Inbound', 'Outbound', 'Access', 'Any', 'Shared', 'Public', 'Recycle',
      # 'Fax', 'Print', 'Scan', 'Ocr', 'Workflow', 'Schedule', 'System',
      # 'Other', 'CdoInfostore', 'CdoFolder'
      attr_accessor :type

      # @return [Integer] Gets or sets the access level.
      attr_accessor :access

      # @return [Boolean] Gets or sets a value indicating whether to bypass
      # security checks.
      attr_accessor :bypass_security

      # @return [Integer] Gets or sets the page number.
      attr_accessor :page

      # @return [Integer] Gets or sets the size of the page.
      attr_accessor :page_size

      # @return [Enum] Gets or sets the order. Possible values include:
      # 'Unspecified', 'Ascending', 'Descending'
      attr_accessor :sort_order

      # @return [Enum] Gets or sets the column to order by. Possible values
      # include: 'ID', 'Type', 'Name', 'Alias'
      attr_accessor :sort_by


      #
      # Mapper for GetQueueModel class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'GetQueueModel',
          type: {
            name: 'Composite',
            class_name: 'GetQueueModel',
            model_properties: {
              id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'ID',
                constraints: {
                  InclusiveMaximum: 2147483647,
                  InclusiveMinimum: 1
                },
                type: {
                  name: 'Number'
                }
              },
              name: {
                client_side_validation: true,
                required: false,
                serialized_name: 'Name',
                constraints: {
                  MaxLength: 255,
                  MinLength: 0
                },
                type: {
                  name: 'String'
                }
              },
              alias_property: {
                client_side_validation: true,
                required: false,
                serialized_name: 'Alias',
                constraints: {
                  MaxLength: 255,
                  MinLength: 0
                },
                type: {
                  name: 'String'
                }
              },
              type: {
                client_side_validation: true,
                required: false,
                serialized_name: 'Type',
                type: {
                  name: 'String'
                }
              },
              access: {
                client_side_validation: true,
                required: false,
                serialized_name: 'Access',
                type: {
                  name: 'Number'
                }
              },
              bypass_security: {
                client_side_validation: true,
                required: false,
                serialized_name: 'BypassSecurity',
                type: {
                  name: 'Boolean'
                }
              },
              page: {
                client_side_validation: true,
                required: false,
                serialized_name: 'Page',
                constraints: {
                  InclusiveMaximum: 2147483647,
                  InclusiveMinimum: 1
                },
                type: {
                  name: 'Number'
                }
              },
              page_size: {
                client_side_validation: true,
                required: false,
                serialized_name: 'PageSize',
                constraints: {
                  InclusiveMaximum: 1000,
                  InclusiveMinimum: 1
                },
                type: {
                  name: 'Number'
                }
              },
              sort_order: {
                client_side_validation: true,
                required: false,
                serialized_name: 'SortOrder',
                type: {
                  name: 'String'
                }
              },
              sort_by: {
                client_side_validation: true,
                required: false,
                serialized_name: 'SortBy',
                type: {
                  name: 'String'
                }
              }
            }
          }
        }
      end
    end
  end
end
