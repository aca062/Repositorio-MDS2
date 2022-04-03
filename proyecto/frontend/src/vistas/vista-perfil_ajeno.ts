import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-listas_de_reproduccion_ajenas';

@customElement('vista-perfil_ajeno')
export class VistaPerfil_ajeno extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" style="width: 100%;background-color: var(--lumo-contrast-10pct);" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; padding: var(--lumo-space-xl);" id="vaadinHorizontalLayout">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; align-self: center; align-items: center; width: fit-content;" id="vaadinVerticalLayout2">
    <img style="width: 200px; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l);" src="https://www.runneruprecords.com/wp-content/uploads/2019/12/Juice-Wrld-promesa-del-rap-muere.jpg" id="img">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 50%;" id="vaadinVerticalLayout3">
    <vaadin-horizontal-layout style="width: 100%; justify-content: space-between;" id="vaadinHorizontalLayout1">
     <h5 style="margin-top: 40px;" id="h5">Juice WRLD</h5>
     <vaadin-button style="margin-right: 10%; align-self: center;" id="vaadinButton">
       Dejar de seguir 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center;" id="vaadinHorizontalLayout2">
     <h5 id="h51">jWRLD@gmail.com</h5>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="vaadinVerticalLayout4">
    <h5 id="h52">Seguidores</h5>
    <h5 id="h53">55168792</h5>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="vaadinVerticalLayout5">
    <h5 id="h54">Seguidos</h5>
    <h5 id="h55">25</h5>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vista-listas_de_reproduccion_ajenas style="width: 100%; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);" id="vistaListas_de_reproduccion_ajenas"></vista-listas_de_reproduccion_ajenas>
</vaadin-vertical-layout>
`;
  }
  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
