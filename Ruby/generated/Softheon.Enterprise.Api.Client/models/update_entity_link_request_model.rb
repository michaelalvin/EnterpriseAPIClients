# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Softheon.Enterprise.Api.Client
  module Models
    #
    # The model for PUT EntityLink input parameters.
    #
    class UpdateEntityLinkRequestModel
      # @return [String] Gets or sets the name of the virtual.
      attr_accessor :virtual_name

      # @return [Integer] Gets or sets the class.
      attr_accessor :class_property

      # @return [String] Gets or sets the name.
      attr_accessor :name

      # @return [Integer] Gets or sets the acl.
      attr_accessor :acl

      # @return [Integer] Gets or sets the page number.
      attr_accessor :page_number

      # @return [Enum] Gets or sets the state. Possible values include:
      # 'Undefined', 'MaxStates', 'Reserved', 'UserDefined', 'Dynamic',
      # 'Static', 'New', 'CheckedOut', 'Internal', 'Statres5', 'Linked',
      # 'Statres4', 'Statres3', 'Statres2', 'Statres1', 'Locked',
      # 'OnServerCache', 'OnClientCache', 'Fetching', 'Dynres4', 'Dynres3',
      # 'Dynres2', 'Dynres1', 'User1', 'User2', 'User3', 'User4', 'User5',
      # 'User6', 'User7', 'User8', 'User9', 'User10', 'User11', 'User12',
      # 'User13', 'User14', 'User15', 'User16'
      attr_accessor :state

      # @return [String] Gets or sets the note.
      attr_accessor :note


      #
      # Mapper for UpdateEntityLinkRequestModel class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'UpdateEntityLinkRequestModel',
          type: {
            name: 'Composite',
            class_name: 'UpdateEntityLinkRequestModel',
            model_properties: {
              virtual_name: {
                client_side_validation: true,
                required: false,
                serialized_name: 'VirtualName',
                constraints: {
                  MaxLength: 255,
                  MinLength: 0
                },
                type: {
                  name: 'String'
                }
              },
              class_property: {
                client_side_validation: true,
                required: false,
                serialized_name: 'Class',
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
              acl: {
                client_side_validation: true,
                required: false,
                serialized_name: 'Acl',
                type: {
                  name: 'Number'
                }
              },
              page_number: {
                client_side_validation: true,
                required: false,
                serialized_name: 'PageNumber',
                constraints: {
                  InclusiveMaximum: 2147483647,
                  InclusiveMinimum: 0
                },
                type: {
                  name: 'Number'
                }
              },
              state: {
                client_side_validation: true,
                required: false,
                serialized_name: 'State',
                type: {
                  name: 'String'
                }
              },
              note: {
                client_side_validation: true,
                required: false,
                serialized_name: 'Note',
                constraints: {
                  MaxLength: 255,
                  MinLength: 0
                },
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