/*


if (customer == null) {
  plan = BillingPlan.basic();
}
else {
  plan = customer.getPlan();
}

*/

plan = (customer == null) ? BillingPlan.basic() : customer.getPlan();
