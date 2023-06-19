Feature: check validation Certificate

#@Precondition
#  Scenario:
#    When I send number "45924126"
#    Then check validation "true"
#
#
#  @Precondition
#  Scenario:
#    When I send number "459241"
#    Then check validation "false"


  @Precondition
  Scenario Outline
    When I send number "<Certificate>"
    Then check validation "<Expected>"
    Examples:
      |Certificate |Expected|
      |45924126    |true    |
      |459226      |false   |

